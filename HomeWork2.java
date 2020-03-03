public class HomeWork2 {
    public static void main(String[] args) {
        Annotation[] annotation = new Annotation[]{
                new Annotation(new BoundingBox(3, 4, 4, 56), "first boundingbox"),
                new Annotation(new Circle(3, -76, 8), "first circle"),
                new Annotation(new BoundingBox(0, 0, 3, 6), "second boundingbox"),
                new Annotation(new BoundingBox(-2, -7, 1, 10), "Third boundingbox"),
                new Annotation(new BoundingBox(-13, -5, 3,-3 ), "fourth boundingbox"),
                new Annotation(new Circle(0, 0, 4), "Second circle"),
                new Annotation(new Circle(-6, -7, 1), "THIRD circle"),
        };

        if (findByPoint(annotation, 4, 20)!=null)
            System.out.println("Found! It's in "+ findByPoint(annotation, 4, 20).getDescription());
        else System.out.println("There is none:(");
        if (findByPoint(annotation, -100,-100)!=null)
            System.out.println("Found! It's in "+ findByPoint(annotation, -100,-100).getDescription());
        else System.out.println("There is none:(");
        if (findByPoint(annotation, 6,0)!=null)
            System.out.println("Found! It's in "+ findByPoint(annotation, 6,0).getDescription());
        else System.out.println("There is none:(");
        if (findByPoint(annotation, 0,0)!=null)
            System.out.println("Found! It's in "+ findByPoint(annotation, 0,0).getDescription());
        else System.out.println("There is none:(");
        if (findByPoint(annotation, 3,-76)!=null)
            System.out.println("Found! It's in "+ findByPoint(annotation, 3,-76).getDescription());
        else System.out.println("There is none:(");
        Circle fourth=new Circle(5,-8,10);
        Annotation forth=new Annotation(fourth,"Fourth cisrle");
        fourth.move(4,3);
        System.out.println("new coordinates "+fourth.getX()+"; "+ fourth.getY());
    }
        static Annotation findByPoint(Annotation[] annotation, int x, int y){
            for (int i=0;i<annotation.length;i++) {
                if (annotation[i].getFigure() instanceof BoundingBox){
                    if (((((BoundingBox) annotation[i].getFigure()).getX() <= x) && (((BoundingBox) annotation[i].getFigure()).getX2() >= x)) &&
                            ((((BoundingBox) annotation[i].getFigure()).getY() <= y) && (((BoundingBox) annotation[i].getFigure()).getY2() >= y)))
                    {return annotation[i];}
                }
                else if (annotation[i].getFigure() instanceof Circle)
                        if ((x - (((Circle) annotation[i].getFigure()).getX()))*(x - (((Circle) annotation[i].getFigure()).getX())) +
                                (y - ((Circle) annotation[i].getFigure()).getY())*(y - ((Circle) annotation[i].getFigure()).getY()) <=
                                ((Circle) annotation[i].getFigure()).getR()*((Circle) annotation[i].getFigure()).getR())
                            return annotation[i];
            }
            return null;
        }

    }

