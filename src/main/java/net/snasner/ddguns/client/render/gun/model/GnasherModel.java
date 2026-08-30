package net.snasner.ddguns.client.render.gun.model;

import com.mojang.blaze3d.vertex.PoseStack;
import net.snasner.ddguns.client.render.SpecialModels;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.item.ItemStack;
import top.ribs.scguns.client.render.gun.IOverrideModel;
import top.ribs.scguns.client.util.RenderUtil;
import top.ribs.scguns.common.Gun;
import top.ribs.scguns.init.ModItems;
import top.ribs.scguns.item.attachment.IAttachment.Type;

public class GnasherModel implements IOverrideModel {
    public GnasherModel() {
        super();
    }

    public void render(float partialTicks, ItemDisplayContext transformType, ItemStack stack, ItemStack parent, LivingEntity entity, PoseStack matrixStack, MultiBufferSource buffer, int light, int overlay) {
        RenderUtil.renderModel(SpecialModels.GNASHER_MAIN.getModel(), stack, matrixStack, buffer, light, overlay);
        this.renderMagazineAttachments(stack, matrixStack, buffer, light, overlay);
    }

    private void renderMagazineAttachments(ItemStack stack, PoseStack matrixStack, MultiBufferSource buffer, int light, int overlay) {
        if (Gun.hasAttachmentEquipped(stack, Type.MAGAZINE)) {
            if (Gun.getAttachment(Type.MAGAZINE, stack).getItem() == ModItems.EXTENDED_MAG.get()) {
                RenderUtil.renderModel(SpecialModels.GNASHER_EXT_MAG.getModel(), stack, matrixStack, buffer, light, overlay);
            }

            if (Gun.getAttachment(Type.MAGAZINE, stack).getItem() == ModItems.SPEED_MAG.get()) {
                RenderUtil.renderModel(SpecialModels.GNASHER_SPEED_MAG.getModel(), stack, matrixStack, buffer, light, overlay);
            }

            if (Gun.getAttachment(Type.MAGAZINE, stack).getItem() == ModItems.PLUS_P_MAG.get()) {
                RenderUtil.renderModel(SpecialModels.GNASHER_EXT_MAG.getModel(), stack, matrixStack, buffer, light, overlay);
            }
        } else {
            RenderUtil.renderModel(SpecialModels.GNASHER_STAN_MAG.getModel(), stack, matrixStack, buffer, light, overlay);
        }

    }
}