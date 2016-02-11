package com.example.luis.villaverde;


import java.util.List;

/**
 * Created by luis on 08/02/16.
 */
public class Autos {
    String chasis;
    String modelo;


    public Autos(){
        super();
    }

    public Autos(String chasis, String modelo) {
        super();
        this.chasis = chasis;
        this.modelo = modelo;
    }

    public String getChasis(){
        return chasis;
    }

    public void setChasis(String chasis){
        this.chasis=chasis;
    }

    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo){
        this.modelo=modelo;
    }
}

    // This method creates an ArrayList that has two Autos objects
//    public void initializeData() {
  //      autos_list = new ArrayList<>();
    //    autos_list.add(new Autos("CV34503FF", "Ford",R.drawable.ford));
      //  autos_list.add(new Autos("AD33422HH", "Hyundai",R.drawable.hyundai));
        //autos_list.add(new Autos("PP22332JJ", "Toyota",R.drawable.toyota));
   // }

/**
public class Autos {
    int image;
    String chasis;
    String modelo;


    public Autos(){
        super();
    }

    public Autos(int image, String chasis, String modelo) {
        super();

        this.image = image;
        this.chasis = chasis;
        this.modelo = modelo;
    }

    public int getImage(){
        return image;
    }

    public void setImage(int image){
        this.image=image;
    }

    public String getChasis(){
        return chasis;
    }

    public void setChasis(String chasis){
        this.chasis=chasis;
    }

    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo){
        this.modelo=modelo;
    }
}
 */