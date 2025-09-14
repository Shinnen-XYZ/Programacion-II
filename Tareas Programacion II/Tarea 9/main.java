package service;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Sistema de Fotografías ===");
        System.out.println();

        Perfil perfilFotografo = new Perfil("Fotografo", "Especialista en retratos y bodas");
        Perfil perfilCliente = new Perfil("Cliente", "Cliente frecuente del estudio");

        Persona fotografo = new Persona("Juan", "Martinez", perfilFotografo);
        Persona cliente = new Persona("Maria", "Rodriguez", perfilCliente);

        Lugar estudio1 = new Lugar("Estudio Central", "Av. Principal 123", "2222-1111");
        Lugar estudio2 = new Lugar("Estudio Norte", "Calle Norte 456", "2222-2222");
        Lugar parque = new Lugar("Parque Central", "Zona 1", "N/A");

        Fotografia foto1 = new Fotografia("JPG", "/fotos/retrato001.jpg", 2048.5);
        Fotografia foto2 = new Fotografia("PNG", "/fotos/boda001.png", 3072.8);
        Fotografia foto3 = new Fotografia("RAW", "/fotos/paisaje001.raw", 15360.2);

        fotografo.agregarLugar(estudio1);
        fotografo.agregarLugar(estudio2);
        fotografo.agregarLugar(parque);

        fotografo.agregarFotografia(foto1);
        fotografo.agregarFotografia(foto2);
        fotografo.agregarFotografia(foto3);

        cliente.agregarLugar(estudio1);
        cliente.agregarFotografia(foto1);
        System.out.println("INFORMACIÓN DEL FOTÓGRAFO:");
        System.out.println(fotografo);
        System.out.println();

        System.out.println("INFORMACIÓN DEL CLIENTE:");
        System.out.println(cliente);
        System.out.println();

        System.out.println("DETALLES DE LUGARES:");
        System.out.println("Lugar 1: " + estudio1);
        System.out.println("Lugar 2: " + estudio2);
        System.out.println("Lugar 3: " + parque);
        System.out.println();

        System.out.println("DETALLES DE FOTOGRAFÍAS:");
        System.out.println("Foto 1: " + foto1);
        System.out.println("Foto 2: " + foto2);
        System.out.println("Foto 3: " + foto3);
        System.out.println();

        System.out.println("DETALLES DE PERFILES:");
        System.out.println("Perfil Fotógrafo: " + perfilFotografo);
        System.out.println("Perfil Cliente: " + perfilCliente);
        System.out.println();

        System.out.println("=== MODIFICANDO DATOS ===");
        fotografo.setNombre("Carlos");
        fotografo.setApellidos("Hernandez");
        
        Perfil nuevoPerfil = new Perfil("Fotografo Senior", "Más de 10 años de experiencia");
        fotografo.setPerfil(nuevoPerfil);

        System.out.println("Fotógrafo después de modificaciones:");
        System.out.println(fotografo);
        System.out.println();
        System.out.println("=== RESUMEN FINAL ===");
        System.out.println("El fotógrafo trabaja en " + fotografo.getLugares().size() + " lugares de Guatemala");
        System.out.println("El fotógrafo tiene " + fotografo.getFotografias().size() + " fotografías guatemaltecas");
        System.out.println("El cliente de Mixco visita " + cliente.getLugares().size() + " lugar(es)");
        System.out.println("El cliente tiene " + cliente.getFotografias().size() + " fotografía(s)");
        System.out.println();
       
    }
}
