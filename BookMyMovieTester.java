class BookMyMovie{
    private int movieId;
    private int noOfTickets;
    private double discount;
    private double totalAmount;
    BookMyMovie(int movieId,int noOfTickets){
        this.movieId=movieId;
        this.noOfTickets=noOfTickets;
    }
    int calculateDiscount(){
        switch (noOfTickets/5) {
            case 0:
                return 0;
            case 1:
                return 15;
            case 2:
                return 20;
        }
        return 0;
    }
    double calculateTicketAmount(){
        return 150 * noOfTickets - (150 * noOfTickets * (calculateDiscount()/100));
    }
}
public record BookMyMovieTester() {
    public static void main(String[] args) {
        BookMyMovie booking1 = new BookMyMovie(101, 3);
        System.out.println("Total: " + booking1.calculateTicketAmount());

        BookMyMovie booking2 = new BookMyMovie(102, 10);
        System.out.println("Total: " + booking2.calculateTicketAmount());
    }
}
