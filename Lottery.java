public class Lottery {
    Lottery(int[] frequencies) {
    }

    public Lottery(Toy[] toys) {
       
    }

    String getWinnerId() {
        int random = (int) (Math.random() * 10);
        if (random < 2) {
            return "1";
        } else if (random < 3) {
            return "2";
        } else if (random < 4){
            return "3";
        } else if (random < 5){
            return "4";
        } else if (random < 6){
            return "5";
        } else if (random < 7){
            return "6";
        } else if (random < 8){
            return "7";
        } else {
            return "8";
        }
    }
}