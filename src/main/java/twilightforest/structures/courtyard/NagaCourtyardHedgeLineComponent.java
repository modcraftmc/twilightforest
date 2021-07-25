package twilightforest.structures.courtyard;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureManager;
import twilightforest.TFFeature;
import twilightforest.TwilightForestMod;

public class NagaCourtyardHedgeLineComponent extends NagaCourtyardHedgeAbstractComponent {
    public NagaCourtyardHedgeLineComponent(StructureManager manager, CompoundTag nbt) {
        super(manager, NagaCourtyardPieces.TFNCLn, nbt, new ResourceLocation(TwilightForestMod.ID, "courtyard/hedge_line"), new ResourceLocation(TwilightForestMod.ID, "courtyard/hedge_line_big"));
    }

    public NagaCourtyardHedgeLineComponent(TFFeature feature, int i, int x, int y, int z, Rotation rotation) {
        super(NagaCourtyardPieces.TFNCLn, feature, i, x, y, z, rotation, new ResourceLocation(TwilightForestMod.ID, "courtyard/hedge_line"), new ResourceLocation(TwilightForestMod.ID, "courtyard/hedge_line_big"));
    }
}