package de.cristelknight.doapi.client.recipebook.handler;

import de.cristelknight.doapi.client.recipebook.IRecipeBookGroup;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.item.crafting.Recipe;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public abstract class AbstractPrivateRecipeScreenHandler extends AbstractContainerMenu {
    protected AbstractPrivateRecipeScreenHandler(@Nullable MenuType<?> type, int syncId) {
        super(type, syncId);
    }

    public abstract List<IRecipeBookGroup>  getGroups();

    public abstract boolean hasIngredient(Recipe<?> recipe);

    public abstract int getCraftingSlotCount();
}
