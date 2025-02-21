
//Relacion general entre clases, ASOICACION o AGREGAICON depende de donde se vea. Porque no los animales pueden existir si el zoologico no.

public class Anmial
{
    Private String nombreDeAnimal;
    public Anmial(String nombreDeAnimal)
    {
        this.nombreDeAnimal = nombreDeAnimal;
    }
}

public class Zoologico
{
    public Anmial [] Anmiales;

    public zoo(Anmial Anmiales)
    {
        this.Anmiales=Anmiales;
    }
}

public class prueba
{
    public static void main(String args[])
    {
        Zoologico zoo;
        zoo = new Zoologico("perro");

        zoo.Anmiales =new Anmial[3];

        Anmial animalGato = new Anmial("gato")
        Anmial animalPerro = new Anmial("Perro")
        Anmial animalLombriz = new Anmial("lombriz")

        zoo.Anmiales[0] = animalGato;
        zoo.Anmiales[1] = animalPerro;
        zoo.Anmiales[2] = animalLombriz;
        
    }


// COMPOSICION, SI UN ELEMENTO SE DESTRUYE EL OTRO NO PUEDE EXISTIR. SE CONSTRUYEN LOS OBJETOS ADENTRO DEL CONSTRUCTOR DE LA OTRA CLASE.
    public class Abeja
    {
        Private String nombreDeAbeja;

        public Abeja(String nombreDeAbeja)
        {
            this.nombreDeAbeja=nombreDeAbeja;
        }
    }

    public class Panal
    {
        public Abeja enjambre [];
        public Panal()
        {
            enjambre = new Abeja[2];
            enjambre[0] = new Abeja("OEDIR");
            enjambre[1] = new Abeja("SAS");
        }
    }
}