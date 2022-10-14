package br.com.boardgameresource.domain.bus;

public interface DataIn {
    interface Callback{
        void onSuccess();
        void onError(Throwable throwable);
    }
}
