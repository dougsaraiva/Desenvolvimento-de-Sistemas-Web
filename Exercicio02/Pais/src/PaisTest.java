import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.jupiter.api.Assertions.assertEquals;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PaisTest {

   Pais pais, copia;
   static int id;

   @Before
   public void setUp() throws Exception {
      System.out.println("setup");
      pais = new Pais(id, "PaisA", 99999, 9);
      copia = new Pais(id, "PaisA", 99999, 9);
      System.out.println(pais);
      System.out.println(copia);
      System.out.println(id);
   
   }

   @Test
   public void test00Carregar() {
      System.out.println("carregar");
   	// para funcionar o Pais 1 deve ter sido carregado no banco por fora
      Pais fixture = new Pais(1, "Queiti", 4321, 15.2);
      Pais novo = new Pais(1, null, -1, -1);
      novo.carregar();
      assertEquals("testa inclusao", novo, fixture);
   }

   @Test
   public void test01Criar() {
      System.out.println("criar");
      pais.criar();
      id = pais.getId();
      System.out.println(id);
      copia.setId(id);
      assertEquals("testa criação", pais, copia);
   }

   @Test
   public void test02Atualizar() {
      System.out.println("Atualizar");
      pais.setNome("PaisB");
      copia.setNome("PaisB");
      pais.atualizar();
      pais.carregar();
      assertEquals("testa de atualização", pais, copia);
   }
	
   @Test
   public void test03Excluir() {
      System.out.println("Deletar");
      copia.setId(-1);
      copia.setNome(null);
      copia.setPopulacao(-1);
      copia.setArea(-1);
      pais.excluir();
      pais.carregar();
      assertEquals("teste delete", pais, copia);
   }
   
   @Test
   public void test04MaiorPop() {
      System.out.println("Maior população");
      Pais teste = new Pais(2,"China", 1372470000,9596961);
      Pais novoPais = new Pais();
      novoPais = novoPais.maiorPopulacao();
      assertEquals("Teste de maior população", teste, novoPais);
   
   }

   @Test
   public void test05MenorArea() {
      System.out.println("Maior área");
      Pais teste = new Pais(4,"Irlanda", 4635400,257557);
      Pais novoPais = new Pais();
      novoPais = novoPais.menorArea();
      assertEquals("Teste de menor área", teste, novoPais);
   }

   @Test
   public void test06VetorTresPaises() {
      System.out.println("vetorTresPaises");
      Pais teste[] = new Pais[3];
      teste[0] = new Pais(1,"Brasil",207660929,8515767);
      teste[1] = new Pais(2,"China", 1372470000,9596961);
      teste[2] = new Pais(3,"India", 1278160000,7585614);
      ArrayList<Pais> novo = new ArrayList<>();
      Pais novoPais = new Pais();
      novo = novoPais.vetorTresPaises();
      for (int i = 0; i < novo.size(); i++) {
         assertEquals("Teste do método vetorTresPaises", teste[i], novo);
      }
   
   
   }


	

}
