package de.cristelknight.doapi.forge.mixin.sign;

import com.mojang.blaze3d.vertex.PoseStack;
import de.cristelknight.doapi.forge.terraform.sign.TerraformSign;
import net.minecraft.client.gui.screens.inventory.SignEditScreen;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.resources.model.Material;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(SignEditScreen.class)
public class MixinSignEditScreen {
	@ModifyVariable(method = "renderSignBackground", at = @At(value = "INVOKE_ASSIGN", target = "Lnet/minecraft/client/renderer/Sheets;getSignMaterial(Lnet/minecraft/world/level/block/state/properties/WoodType;)Lnet/minecraft/client/resources/model/Material;"))
	private Material getSignTextureId(Material spriteIdentifier, PoseStack matrices, MultiBufferSource.BufferSource vertexConsumers, BlockState state) {
		if (state.getBlock() instanceof TerraformSign) {
			return new Material(Sheets.SIGN_SHEET, ((TerraformSign) state.getBlock()).getTexture());
		}
		return spriteIdentifier;
	}
}
