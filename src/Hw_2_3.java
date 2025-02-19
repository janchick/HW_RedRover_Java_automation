public class Hw_2_3 {
    public static void main(String[] args) {
        int totalTreasure = 213500;
        int numberOfPirates = 8;

        int ownerShare = totalTreasure / 2;
        int remainingTreasure = totalTreasure - ownerShare;
        int captainShare = remainingTreasure / 2;
        remainingTreasure = remainingTreasure - captainShare;

        int treasureForEachPirate = remainingTreasure / (numberOfPirates+1);
        remainingTreasure = remainingTreasure % (numberOfPirates +1);
        captainShare += treasureForEachPirate;

    /*    shipOwnerTreasure = Math.floor(shipOwnerTreasure * 100)/100;
        captainTreasure = Math.floor(captainTreasure * 100)/100;
        treasureForEachPirate = Math.floor(treasureForEachPirate * 100)/100; */



        System.out.println("Доля Владелеца корабля : " + ownerShare);
        System.out.println("Доля Капитана корабля : " + captainShare);
        System.out.println("Каждый пират получит по:" + treasureForEachPirate);
        System.out.println("Остаток : " + remainingTreasure);
        System.out.println("Доля Капитана Jack Sparrow : " + (ownerShare + captainShare));


        System.out.println("Summ: " + (ownerShare + captainShare + treasureForEachPirate*numberOfPirates + remainingTreasure));
    }
}
