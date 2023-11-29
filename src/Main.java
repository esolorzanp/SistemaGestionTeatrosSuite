import model.*;

import java.sql.Date;

public class Main {
    public static void main(String[] args) {
        SecretariaCultura secretariaCultura = new SecretariaCultura();
        Teatro teatro1 = new Teatro("Teatro Jorge Isaacs", "Cra. 3 #12-28", "6024800000", "contacto@teatrojorgeisaacs.com", "www.teatrojorgeisaacs.com", TipoTeatro.ESTATAL, 100);
        Teatro teatro2 = new Teatro("Teatro Municipal Enrique Buenaventura", "Cra. 12 #4-51", "3157285402", "contacto@teatroenriquebuenaventura.com", "www.teatroenriquebuenaventura.com.com", TipoTeatro.ESTATAL, 200);

        Personaje p11 = new Personaje("alicia01","Alicia");
        Personaje p12 = new Personaje("alicia02","El sombrerero");
        Personaje p13 = new Personaje("alicia03","El gato risón");
        Obra obra1 = new Obra("01", "Alicia en el pais de las maravillas", "Gustavo López Perez", "https://asdsdf", TipoObra.OTRO);
        obra1.agregarPersonaje(p11);
        obra1.agregarPersonaje(p12);
        obra1.agregarPersonaje(p13);

        Personaje p21 = new Personaje("charlie01","Charlie Bucket");
        Personaje p22 = new Personaje("charlie02","Willy Wonka");
        Personaje p23 = new Personaje("charlie03","El abuelo Joe");
        Personaje p24 = new Personaje("charlie04","augusto Gloop");
        Personaje p25 = new Personaje("charlie05","Veruka Salt");
        Personaje p26 = new Personaje("charlie06","Mike Tevé");
        Personaje p27 = new Personaje("charlie07","Oompas Loompas #1");
        Personaje p28 = new Personaje("charlie08","Oompas Loompas #2");
        Personaje p29 = new Personaje("charlie09","Oompas Loompas #3");
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
        Temporada temporada2 = new Temporada(version2, teatro2, Date.valueOf("2023-12-15"), Date.valueOf("2025-01-15"), "http://qweryy", "http://asdfg", 100000000.0f);

        // dos funciones

        System.out.println(temporada1);
        System.out.println();
        System.out.println(temporada2);
    }
}