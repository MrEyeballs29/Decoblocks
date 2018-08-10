package mreyeballs29.decoblocks.gui;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mreyeballs29.decoblocks.inventory.ContainerAlloySmelter;
import mreyeballs29.decoblocks.tileentity.TileEntityAlloySmelter;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

@SideOnly(Side.CLIENT)
public class GUIAlloySmelter extends GuiContainer {
	
	private static final ResourceLocation location = new ResourceLocation("decoblock:textures/gui/container/alloysmelter.png");
	private TileEntityAlloySmelter alloysmeltertile;
	
	
	public GUIAlloySmelter(InventoryPlayer player, TileEntityAlloySmelter tilealloysmelter) {
		super(new ContainerAlloySmelter(player, tilealloysmelter));
		this.alloysmeltertile = tilealloysmelter;
	}

	@Override
	protected void drawGuiContainerForegroundLayer(int p_146979_1_, int p_146979_2_) {
		String text = this.alloysmeltertile.hasCustomInventoryName() ? this.alloysmeltertile.getInventoryName() : I18n.format(this.alloysmeltertile.getInventoryName(), new Object[0]);
		this.fontRendererObj.drawString(text, this.xSize / 2 - this.fontRendererObj.getStringWidth(text) / 2, 6, 4210752);
		this.fontRendererObj.drawString(I18n.format("container.inventory", new Object[0]), 8, this.ySize - 94, 4210752);
	}
	
	@Override
	protected void drawGuiContainerBackgroundLayer(float par1, int par2, int par3) {
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		this.mc.getTextureManager().bindTexture(location);
		int k = (this.width - this.xSize) / 2;
		int l = (this.height - this.ySize) / 2;
		this.drawTexturedModalRect(k, l, 0, 0, this.xSize, this.ySize);
		
		if (this.alloysmeltertile.isBurning()) {
			int i1 = this.alloysmeltertile.getRemainingBurnTime(13);
			this.drawTexturedModalRect(k + 56, l + 36 + 12 - i1, 176, 12 - i1, 14, i1 + 1);
			int i2 = this.alloysmeltertile.getProgressScaled(24);
			this.drawTexturedModalRect(k + 79, l + 34, 176, 14, i2 + 1, 16);
		}
	}

}