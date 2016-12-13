package view;

/**
 * Created by Yesid Lazaro on 9/26/16.
 */

public interface BaseView {
    void showProgress(String message);

    void showErrorMessage(String message);

    void hideProgress();

}
