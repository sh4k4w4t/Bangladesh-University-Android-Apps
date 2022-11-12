package bu.edu.bd.android.HomeFragmentItems.administration;

public class BoardOfTrustModel {
    int picture;
    String title;

    public BoardOfTrustModel(int picture, String title) {
        this.picture = picture;
        this.title = title;
    }

    public int getPicture() {
        return picture;
    }

    public void setPicture(int picture) {
        this.picture = picture;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
