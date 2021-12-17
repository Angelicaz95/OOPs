package com.company.reviewclass10;

public abstract  class DataBase {
    abstract void openDataBase();
    abstract void readData();
    abstract void editData();
    abstract void  closeDataBase();
}

class MySQLServer extends DataBase{


    @Override
    void openDataBase() {

    }

    @Override
    void readData() {

    }

    @Override
    void editData() {

    }

    @Override
    void closeDataBase() {

    }
}
