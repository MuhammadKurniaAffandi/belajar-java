/*
* Materi Super Keyword*/
class Shape {

    int getCorner(){
        return 0;
    }
}

class Rectangle extends Shape {

    int getCorner(){
        return 4;
    }

    // mengakses method dari class parent
    int getParentCorner(){
        return super.getCorner();
    }
}
