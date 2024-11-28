import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Objects;

public class Universidade {
    List<Funcionário> lista = new ArrayList<>();

    public Funcionário buscarFuncionário( int matrícula )
    {
        for ( Funcionário f : lista )
            if( f.getMatrícula() == matrícula ) return f;
        return null;
    }

    public boolean adicionarFuncionário( Funcionário func )
    {
        if ( Objects.isNull( func ) ) return false;

        for ( Funcionário temp : lista )
            if ( temp.getMatrícula() == func.getMatrícula() )
                return false;

        return lista.add( func );
    }
}