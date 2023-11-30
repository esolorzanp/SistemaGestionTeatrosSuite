import model.*;

import java.sql.Date;
import java.sql.Time;

public class Main {
    public static void main(String[] args) {
        SecretariaCultura secretariaCultura = new SecretariaCultura();
        Teatro teatro1 = new Teatro("Teatro Jorge Isaacs", "Cra. 3 #12-28", "6024800000", "contacto@teatrojorgeisaacs.com", "www.teatrojorgeisaacs.com", TipoTeatro.ESTATAL, 100);
        Teatro teatro2 = new Teatro("Teatro Municipal Enrique Buenaventura", "Cra. 12 #4-51", "3157285402", "contacto@teatroenriquebuenaventura.com", "www.teatroenriquebuenaventura.com.com", TipoTeatro.ESTATAL, 200);

        Personaje p11 = new Personaje("alicia01", "Alicia");
        Personaje p12 = new Personaje("alicia02", "El sombrerero");
        Personaje p13 = new Personaje("alicia03", "El gato risón");
        Obra obra1 = new Obra("01", "Alicia en el pais de las maravillas", "Gustavo López Perez", "https://asdsdf", TipoObra.OTRO);
        obra1.agregarPersonaje(p11);
        obra1.agregarPersonaje(p12);
        obra1.agregarPersonaje(p13);

        Personaje p21 = new Personaje("charlie01", "Charlie Bucket");
        Personaje p22 = new Personaje("charlie02", "Willy Wonka");
        Personaje p23 = new Personaje("charlie03", "El abuelo Joe");
        Personaje p24 = new Personaje("charlie04", "augusto Gloop");
        Personaje p25 = new Personaje("charlie05", "Veruka Salt");
        Personaje p26 = new Personaje("charlie06", "Mike Tevé");
        Personaje p27 = new Personaje("charlie07", "Oompas Loompas #1");
        Personaje p28 = new Personaje("charlie08", "Oompas Loompas #2");
        Personaje p29 = new Personaje("charlie09", "Oompas Loompas #3");
        Obra obra2 = new Obra("01", "Charlie y la fábrica de chocolates", "Reinaldo Robledo Suezca", "https://zxcvf", TipoObra.COMEDIA);
        obra2.agregarPersonaje(p21);
        obra2.agregarPersonaje(p22);
        obra2.agregarPersonaje(p23);
        obra2.agregarPersonaje(p24);
        obra2.agregarPersonaje(p25);
        obra2.agregarPersonaje(p26);
        obra2.agregarPersonaje(p27);
        obra2.agregarPersonaje(p28);
        obra2.agregarPersonaje(p29);

        Director director1 = new Director("1010202030", "Alberto Rojas Perea", "Universidad Nacional de Colombia");
        Director director2 = new Director("1010205070", "Luis Fernando Montoya Mota", "Universidad de Mexico");
        Version version1 = new Version(obra1, director1, Date.valueOf("1997-10-25"), "http://aaaa");
        Version version2 = new Version(obra2, director2, Date.valueOf("2005-03-13"), "http://bbbb");

        Temporada temporada1 = new Temporada(version1, teatro1, Date.valueOf("2023-12-01"), Date.valueOf("2024-01-31"), "http://qweryy", "http://asdfg", 100000000.0f);
        Funcion funcion11 = new Funcion(Date.valueOf("2023-12-01"), Time.valueOf("19:00:00"));
        Funcion funcion12 = new Funcion(Date.valueOf("2023-12-08"), Time.valueOf("19:00:00"));
        Funcion funcion13 = new Funcion(Date.valueOf("2023-12-15"), Time.valueOf("19:00:00"));
        Funcion funcion14 = new Funcion(Date.valueOf("2023-12-22"), Time.valueOf("19:00:00"));
        Funcion funcion15 = new Funcion(Date.valueOf("2023-12-29"), Time.valueOf("19:00:00"));
        temporada1.agregarFuncion(funcion11);
        temporada1.agregarFuncion(funcion12);
        temporada1.agregarFuncion(funcion13);
        temporada1.agregarFuncion(funcion14);
        temporada1.agregarFuncion(funcion15);

        Temporada temporada2 = new Temporada(version2, teatro2, Date.valueOf("2023-12-15"), Date.valueOf("2025-01-15"), "http://qweryy", "http://asdfg", 100000000.0f);
        Funcion funcion21 = new Funcion(Date.valueOf("2023-12-15"), Time.valueOf("22:00:00"));
        Funcion funcion22 = new Funcion(Date.valueOf("2023-12-22"), Time.valueOf("22:00:00"));
        Funcion funcion23 = new Funcion(Date.valueOf("2023-12-29"), Time.valueOf("22:00:00"));
        Funcion funcion24 = new Funcion(Date.valueOf("2023-01-05"), Time.valueOf("22:00:00"));
        Funcion funcion25 = new Funcion(Date.valueOf("2023-01-12"), Time.valueOf("22:00:00"));
        temporada2.agregarFuncion(funcion21);
        temporada2.agregarFuncion(funcion22);
        temporada2.agregarFuncion(funcion23);
        temporada2.agregarFuncion(funcion24);
        temporada2.agregarFuncion(funcion25);

        System.out.println(temporada1);
        System.out.println();
        System.out.println(temporada2);
    }
}