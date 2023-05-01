import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        /*Dados os modelos dos carros e seus respectivos consumos na estrada, faça:
         * modelo: Gol - consumo = 14,4 km/l
         * modelo: Uno - consumo = 15,6 km/l
         * modelo: Mobi - consumo = 16,1 km/l
         * modelo: HB20 - consumo = 14,5 km/l
         * modelo: Kwid - consumo = 15,6 km/l
         *
         * MAP carrosPopulares = new HashMap(); // antes do Java 5
         * Map<String, Double> carrosPopulares = new HashMap<>(); // Generics (Java 5)
         * HashMap <String, Double> carros populares = new HashMap<>();
         * Map<String, Double> carrosPopulares = Map.of("gol",14.4, "uno", 15.6 .......
         *
         */
        System.out.println("Crie um dicionário que relacione seus modelos e e respectivos consumos");

        Map<String, Double> carrosPopulares = new HashMap<>() {{
            put("Gol", 14.4);
            put("Uno", 15.6);
            put("Mobi", 16.1);
            put("HB20", 14.5);
            put("Kwid", 15.6);
        }};
        //System.out.println(carrosPopulares);

        //System.out.println("Substitua o consumo do gol por 15,2 km/l");
        carrosPopulares.put("Gol", 15.2);
        System.out.println(carrosPopulares);

        //System.out.println(" Verifique se o modelo tukson esta presente na lista :"+carrosPopulares.containsKey("Tukson"));

        //System.out.println("Exiba o consumo do uno "+ carrosPopulares.get("Uno"));
/*

		System.out.println("exiba os modelos");
		Set<String>modelos = carrosPopulares.keySet();
		System.out.println(modelos);

		System.out.println("Exiba os consumos dos carros");
		Collection<Double>consumos = carrosPopulares.values();
		System.out.println(consumos);

		System.out.println("Exiba o modelo mais econômico e seu respectivo consumo");

		Double consumoMaisEfic = Collections.max(carrosPopulares.values());
		Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
		String modeloMaisEfic = "";

		for(Map.Entry<String, Double> entry: entries) {
			if(entry.getValue().equals(consumoMaisEfic)) {
				modeloMaisEfic = entry.getKey();
				System.out.println("Modelo mais eficiente:" +modeloMaisEfic + " - "+ "Consumo: "+ consumoMaisEfic );
			}

		}
*/
        System.out.println("Exiba o modelo menos econômico e seu respectivo consumo");

        Double consumoMenosEfic = Collections.min(carrosPopulares.values());
        //System.out.println(consumoMenosEfic);
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMenosEfic = "";

        for(Map.Entry<String, Double> entry: entries) {
            if (entry.getValue().equals(consumoMenosEfic)) {
                modeloMenosEfic = entry.getKey();
                System.out.println("O modelo menos eficiente é "+ modeloMenosEfic + " - consumo: "+ consumoMenosEfic);
            }
        }


        Double somaconsumo = 0d;
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        while(iterator.hasNext()) {
            somaconsumo+=iterator.next();
        }

        System.out.println("Exiba a soma do consumo de todos carros: "+ somaconsumo);
        Double mediaConsumo = somaconsumo / carrosPopulares.size();

        System.out.println(" A média do consumo é : "+ mediaConsumo);

        System.out.println("Remova os modelos que tiverem consumo igual a 15.6 km/L");
        Iterator<Double> iterator2 = carrosPopulares.values().iterator();
        while(iterator2.hasNext()) {
            if(iterator2.next().equals(15.6)) {
                iterator2.remove();
            }

        }
        System.out.println(carrosPopulares);

    }
}


