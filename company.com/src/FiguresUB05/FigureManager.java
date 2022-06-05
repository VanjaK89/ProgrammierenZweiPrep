package FiguresUB05;

import java.util.ArrayList;
import java.util.HashMap;

public class FigureManager {

    ArrayList<Figure> figures = new ArrayList<>();

    public void addFigures(Figure f){
        figures.add(f);
    }

    public  double getMaxPerimeter(){
        double erg = 0;
        for(Figure f: figures){
            if(f.getPerimeter() > erg){
                erg = f.getPerimeter();
            }
        }
        return erg;
    }

    public double getAvarageAreaSize(){
        double avg = 0;
        double anzahl= 1;
        for(Figure f: figures){
            avg = avg + f.getArea();
        }
        return avg = avg / figures.size();
    }

    public HashMap<String, Double>getAreaBySizeCategories(){

        HashMap<String, Double> hashMap = new HashMap<String, Double>();
        double klein = 0;
        double mittel = 0;
        double groß = 0;

        for(Figure f: figures){
            double area = f.getArea();
            if(area < 1000){
                klein += area;
            }
            else{
                if(area >=5000){
                    groß += area;
                }
                else{
                    mittel += area;
                }
            }
        }
        hashMap.put("Klein", klein);
        hashMap.put("Mittel", mittel);
        hashMap.put("Groß", groß);
        return hashMap;
    }



}
