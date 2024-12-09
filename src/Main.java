public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println(String.format("Ano de lançamento: %d", anoDeLancamento));
        //Em versões mais avançadas posso fazer assim: System.out.printf("Ano de lançamento: %d", anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println("Media: " + media);
        String sinopse;
        sinopse = "Filme de aventura com Tom Cruise";
        System.out.println(sinopse);

        int classificacao = (int) media;
        System.out.println(classificacao);
    }
}