class cardtest {
    public static void main(String args[]){
        System.out.println("card.width= "+Card.width);
        System.out.println("card.height= "+Card.height);

        Card c1= new Card();
        c1.kind="heart";
        c1.number=7;

        Card c2= new Card();
        c2.kind="spade";
        c2.number=4;

        System.out.println("c1은"+c1.kind+c1.number+"이며 크기는 "+c1.width,c1.height);
        System.out.println("c1은"+c2.kind+c2.number+"이며 크기는 "+c2.width,c2.height);
    

        System.out.println("크기를 변경합니다.");

        c1.width=50;
        c1.height=80;

        System.out.println("c1은"+c1.kind+c1.number+"이며 크기는 "+c1.width,c1.height);
        System.out.println("c1은"+c2.kind+c2.number+"이며 크기는 "+c2.width,c2.height);
    
    }
}
