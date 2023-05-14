package de.cristelknight.doapi.fabric.client;

import de.cristelknight.doapi.client.DoApiClient;
import de.cristelknight.doapi.client.terraform.CustomBoatClientHelper;
import net.fabricmc.api.ClientModInitializer;

public class DoApiClientFabric implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        DoApiClient.onClientInit();
        CustomBoatClientHelper.onClientInit();
    }
}
