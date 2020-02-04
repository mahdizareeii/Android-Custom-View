package com.sample.customview.customView;

public class ButtonTextProgressModel {

    private String txtConfirm;
    private String txtTitle;
    private int visibility;

    public ButtonTextProgressModel(String txtConfirm, String txtTitle, int visibility) {
        this.txtConfirm = txtConfirm;
        this.txtTitle = txtTitle;
        this.visibility = visibility;
    }

    public String getTxtConfirm() {
        return txtConfirm;
    }

    public void setTxtConfirm(String txtConfirm) {
        this.txtConfirm = txtConfirm;
    }

    public String getTxtTitle() {
        return txtTitle;
    }

    public void setTxtTitle(String txtTitle) {
        this.txtTitle = txtTitle;
    }

    public int getVisibility() {
        return visibility;
    }

    public void setVisibility(int visibility) {
        this.visibility = visibility;
    }
}
