class game {
    String name;
    String type; 
    game(){
        name ="cricket";
        type ="indoor";
    }
}

class player extends game{
    String playername;
    player(){
        playername="virat";
    }
}

class student extends game{
    String gamename;
    student(){
        gamename="chess";
    }
}

public class hierarchical {
    public static void main(String[] args) {
        player p = new player();
        student s = new student();

        System.out.println(p.playername+"  is "+p.name+"player");
        System.out.println(s.gamename+" is a "+ s.type+" game");
    }
    
}
