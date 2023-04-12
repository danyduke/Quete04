public class Movies {

public static void main(String[] args) {

        String[] movies = {"Les Aventuriers de l'Arche", "Le Temple de l'Arche", "La Dernière Croisade"};

        String[][] actors = {{"Harrison Ford", "Karen Allen", "Paul Freeman"},
        {"Harrison Ford", "Kate Capshaw", "Ke Hury Quan"},
        {"Harrison Ford", "Sean Connery", "Denholm Elliott"}}; 
    

        for (int i = 0; i < movies.length; i++) {
            System.out.println("Dans le film " + movies[i] + ", les principaux acteurs sont : " + actors[i][0] + ", "
            + actors[i][1] + ", " + actors[i][2]);
        }
    };
};