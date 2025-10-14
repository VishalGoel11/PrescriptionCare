package com.healthcare.PrescriptionCare.exceptions;

import lombok.Data;

@Data
public class UnableToSaveEntity extends Exception{

    private Object obj;

    public UnableToSaveEntity(Object obj){
        this.obj=obj;
    }

    public Object getObj() {
        return obj;
    }
}
