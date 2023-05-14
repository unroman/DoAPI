package de.cristelknight.doapi;

import com.mojang.datafixers.util.Pair;
import de.cristelknight.doapi.terraform.boat.TerraformBoatType;
import dev.architectury.injectables.annotations.ExpectPlatform;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.vehicle.Boat;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;

import java.util.List;
import java.util.Map;
import java.util.Set;


public class DoApiExpectPlatform {

    @ExpectPlatform
    public static <T> List<Pair<List<String>, T>> findAPIs(Class<T> returnClazz, String name, Class<?> annotationClazz){
        throw new AssertionError();
    }

    @ExpectPlatform
    public static void addSignSprite(ResourceLocation signTextureId){
        throw new AssertionError();
    }
    @ExpectPlatform
    public static Block getSign(ResourceLocation signTextureId){
        throw new AssertionError();
    }
    @ExpectPlatform
    public static Block getWallSign(ResourceLocation signTextureId){
        throw new AssertionError();
    }

    @ExpectPlatform
    public static Block getHangingSign(ResourceLocation hangingSignTextureId, ResourceLocation hangingSignGuiTextureId){
        throw new AssertionError();
    }

    @ExpectPlatform
    public static Block getWallHangingSign(ResourceLocation hangingSignTextureId, ResourceLocation hangingSignGuiTextureId){
        throw new AssertionError();
    }


    @ExpectPlatform
    public static void addFlammable(int burnOdd, int igniteOdd, Block... blocks){
        throw new AssertionError();
    }
    @ExpectPlatform
    public static void registerBoatType(ResourceLocation resourceLocation, TerraformBoatType type) {
        throw new AssertionError();
    }

    @ExpectPlatform
    public static Map<ResourceLocation, Boolean> getAllBoatTypeNamesAndRaft(){
        throw new AssertionError();
    }

    @ExpectPlatform
    public static Boat createBoat(ResourceLocation boatTypeName, Level world, double x, double y, double z, boolean chest) {
        throw new AssertionError();
    }
}
