package Model;

import Brand.Brand;

public class Model {

    public void print(Brand brand) {

        brand.Mercedes();

    }

    public static void main(String[] args) {

        Brand brd = new Brand();
        brd.name = "Hyundai";

        Model mdl = new Model();
        mdl.print(brd);

    }

}
