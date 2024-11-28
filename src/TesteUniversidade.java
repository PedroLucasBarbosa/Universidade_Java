import org.junit.Assert;
import org.junit.Test;

public class TesteUniversidade
{
    @Test
    public void testAddNãoFunciona()
    {
        Universidade u = new Universidade();

        Professor p1 = new Professor( 555, "ana",
                1200.99, 20 );

        Professor pClone = new Professor( 555, "ana",
                1200.99, 20 );

        Gerente g1 = new Gerente( 777, "pedro",
                3000.99, 500 );
        Gerente gNull  = null;

        boolean resultadoProf = u.adicionarFuncionário( p1  ); // ok
        boolean resultadoGer = u.adicionarFuncionário( g1 );  // ok
        boolean resultadoProfClone = u.adicionarFuncionário( pClone  ); // não
        boolean resultadoGNull = u.adicionarFuncionário( gNull ); // não

        Assert.assertTrue( resultadoProf );
        Assert.assertTrue( resultadoGer );
        Assert.assertFalse( resultadoProfClone );
        Assert.assertFalse( resultadoGNull );
    }

    @Test
    public void testAddFunciona()
    {
        Universidade u = new Universidade();
        Gerente g1 = new Gerente( 777, "pedro",
                3000.99, 500 );
        Professor p1 = new Professor( 555, "ana",
                1200.99, 20 );

        boolean resultadoProf = u.adicionarFuncionário( p1  );
        boolean resultadoGer = u.adicionarFuncionário( g1 );

        Assert.assertTrue( resultadoProf );
        Assert.assertTrue( resultadoGer );
    }

    @Test
    public void testBuscaFunciona()
    {
        Universidade u = new Universidade();

        Professor p1 = new Professor( 555, "João",
                1200.99, 20 );
        u.adicionarFuncionário( p1 );

        Funcionário funcionário = u.buscarFuncionário( 555 );

        Assert.assertNotNull( funcionário );
        Assert.assertEquals( funcionário.getMatrícula(), p1.getMatrícula() );
    }

    @Test
    public void testBuscaNãoFunciona()
    {
        Universidade u = new Universidade();

        Professor p1 = new Professor( 555, "ana",
                1200.99, 20 );

        u.adicionarFuncionário( p1 );
        Funcionário funcionário = u.buscarFuncionário( 999 );

        Assert.assertNull( funcionário );
    }
}