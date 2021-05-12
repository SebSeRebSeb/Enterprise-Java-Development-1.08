package VideoStreamingTask;

abstract class Video {
    private String name;
    private int length;
    private boolean hasSeen;
    private Integer stars;

    public Video(String name, int length) {
        this.name = name;
        this.length = length;
        this.hasSeen = false;
        this.stars = null;
    }
    public void sawAndLiked(int b){
        if(b<6 && b>0) {
            this.stars = b;
            this.hasSeen = true;
        }else{
            System.out.println("Please Enter a Star Number between 1-5");
        }
    }

    public String getName() {
        return name;
    }

    public int getLength() {
        return length;
    }

    public boolean isHasSeen() {
        return hasSeen;
    }
}
