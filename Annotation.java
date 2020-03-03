public class Annotation {
    private Figure figure;
    private String description;
    Annotation(Figure figure, String description){
        this.figure=figure;
        this.description=description;
    }

    public Figure getFigure() {
        return figure;
    }

    public String getDescription() {
        return description;
    }
}
