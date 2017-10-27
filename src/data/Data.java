/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;

/**
 *
 * @author formation
 */
public class Data {
   
    private String tache ;
    
    private String categorie;
    
    private String id;
    
    private String fait;  

    
    public Data (String tache, String categorie, String id, String fait) {
        this.tache= tache;
        this.categorie = categorie;
        this.id =id;
        this.fait=fait;
    
    }

    public String getTache() {
        return tache;
    }

    public void setTache(String tache) {
        this.tache = tache;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFait() {
        return fait;
    }

    public void setFait(String fait) {
        this.fait = fait;
    }
    
    }

