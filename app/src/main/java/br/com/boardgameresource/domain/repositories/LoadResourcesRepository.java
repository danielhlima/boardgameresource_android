package br.com.boardgameresource.domain.repositories;

import br.com.boardgameresource.domain.bus.DataOut;

public interface LoadResourcesRepository {
    void loadResources(DataOut.Callback callback);
}
