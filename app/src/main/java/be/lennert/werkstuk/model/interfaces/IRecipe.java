package be.lennert.werkstuk.model.interfaces;

public interface IRecipe {
    int getId();
    String getTitle();
    String getImage();
    void setPortions(int portions);
    int getPortions();


}
