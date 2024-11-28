public class ProjHeranca {

    public static void main( String[] args )
    {
        Professor p = new Professor();
        Professor p2 = new Professor(123, "João", 1200, 40 );


        System.out.println( p.toString() );
        System.out.println( p2.toString() );
        System.out.println( p.getSalário() );
        System.out.println( p2.getSalário() );
    }
}