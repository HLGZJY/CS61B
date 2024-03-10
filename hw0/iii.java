
public static void main(String[] args){
    String a = "Achilles";
    String t = "Tortoise";
    double aPos = 0;
    double tPos = 100;
    double aSpeed = 20;
    double tSpeed = 10;
    double totalTime = 0;
    
    while (aPos < tPos) {
        double timeToReach = (tPos - aPos) / aSpeed;
        totalTime = totalTime + timeToReach;

        System.out.println("At time: " + totalTime);
        System.out.println("    " + a + " is at position " + aPos);
        System.out.println("    " + t + " is at position " + tPos);

        aPos = aPos + timeToReach * aSpeed;
        tPos = tPos + timeToReach * tSpeed;
        }

    }

