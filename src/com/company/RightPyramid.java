package com.company;

import static com.company.UtilityFormat.format_number;

public class RightPyramid extends EquilateralTriangle{
    private double apothem;

    public RightPyramid(double side,double apothem) {
        super(side);
        setApothem(apothem);

    }
    public double getApothem() {
        return apothem;
    }

    public void setApothem(double apothem) {
        this.apothem = apothem>0?apothem:0;
    }
    public double get_volume() {
        return(super.get_square()*this.apothem)/3 ;
    }

    @Override
    public double get_square() {
        return super.get_square()+(3*super.getSide()*this.apothem)/2;
    }

    @Override
    public String toString() {
        String result= super.getSide()!= 0 && this.apothem!=0?"\nRightPyramid ({"+"volume="+format_number(get_volume())+"; square"+format_number(get_square())+"}"
                :"\nRightPyramid {side="+super.getSide()+"; apothem="+this.apothem+"(side or apothem=0)}";
        return result+super.toString()+")";
    }
}
