public class Painting {

    private String artist;
    private String name;
    private String style;

    // Empty Constructor
    public Painting(){
        artist = "";
        name = "";
        style = "";

    }

    //Non-empty Constructor
    public Painting(String a, String n, String s){
        artist = a;
        name = n;
        style = s;
    }

    //getters and setters

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    // to string

    public String toString (){
        String output =  "\nArtist: " + artist + "\n" + "Artwork's Name: " + name + "\n" + "ArtStyle: " + style ;
        return  output;
    }
}
