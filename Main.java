public class Main {
    public static void main(String[] args) {
        Equipo equipo1 = new Equipo("Jumbo", "Bélgica");
        Velocista velocista1 = new Velocista(1234, "Peter Sagan", 50, 70);
        Escalador escalador = new Escalador(5678, "Nairo Quintana", 20, 15);
        Contrarelojista contrarelojista1 = new Contrarelojista(1357, "Esteban Chavez", 120);

        equipo1.añadirCiclista(velocista1);
        equipo1.añadirCiclista(escalador);
        equipo1.añadirCiclista(contrarelojista1);

        equipo1.listarEquipo();
        //Imprimir listar equipo
    
    }

}
