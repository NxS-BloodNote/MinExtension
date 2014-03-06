package mcmod.nxs.minextension.gen;

import java.util.Random;

import mcmod.nxs.minextension.core.BlockHandler;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGenHandler implements IWorldGenerator {
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch (world.provider.dimensionId) {
		case -1:
			generateNether(world, random, chunkX * 16, chunkZ * 16);
		case 0:
			generateSurface(world, random, chunkX * 16, chunkZ * 16);
		case 1:
			generateEnd(world, random, chunkX * 16, chunkZ * 16);
		}
	}

	private void generateEnd(World world, Random random, int x, int z) {
		int Xcoord = x + random.nextInt(8);
		int Ycoord = 10 + random.nextInt(256);
		int Zcoord = z + random.nextInt(8);
		(new WorldGenEndMinable(BlockHandler.amethyst_ore, 150, 4)).generate(world, random, Xcoord, Ycoord, Zcoord);
		(new WorldGenEndMinable(BlockHandler.mythril_ore, 150, 6)).generate(world, random, Xcoord, Ycoord, Zcoord);
	}

	private void generateSurface(World world, Random random, int x, int z) {
		for (int i = 0; i < 13; i++) {
			int randPosX = x + random.nextInt(16);
			int randPosY = random.nextInt(64);
			int randPosZ = z + random.nextInt(16);
			(new WorldGenMinable(BlockHandler.copper_ore, 5 + random.nextInt(7))).generate(world, random, randPosX, randPosY, randPosZ);
		}
		for (int i = 0; i < 13; i++) {
			int randPosX = x + random.nextInt(16);
			int randPosY = random.nextInt(52);
			int randPosZ = z + random.nextInt(16);
			(new WorldGenMinable(BlockHandler.platinum_ore, 4 + random.nextInt(5))).generate(world, random, randPosX, randPosY, randPosZ);
		}
		for (int i = 0; i < 13; i++) {
			int randPosX = x + random.nextInt(16);
			int randPosY = random.nextInt(40);
			int randPosZ = z + random.nextInt(16);
			(new WorldGenMinable(BlockHandler.ruby_ore, 3 + random.nextInt(3))).generate(world, random, randPosX, randPosY, randPosZ);
		}
		for (int i = 0; i < 13; i++) {
			int randPosX = x + random.nextInt(16);
			int randPosY = random.nextInt(38);
			int randPosZ = z + random.nextInt(16);
			(new WorldGenMinable(BlockHandler.sapphire_ore, 2 + random.nextInt(1))).generate(world, random, randPosX, randPosY, randPosZ);
		}
	}

	private void generateNether(World world, Random random, int x, int z) {
		int Xcoord = x + random.nextInt(8);
		int Ycoord = random.nextInt(256);
		int Zcoord = z + random.nextInt(8);

		(new WorldGenNetherMinable(BlockHandler.onyx_ore, 0, 7)).generate(world, random, Xcoord, Ycoord, Zcoord);
		(new WorldGenNetherMinable(BlockHandler.topaze_ore, 0, 5)).generate(world, random, Xcoord, Ycoord, Zcoord);
	}

	/**
	 * Adds an Ore Spawn to Minecraft. Simply register all Ores to spawn with
	 * this method in your Generation method in your IWorldGeneration extending
	 * Class
	 * 
	 * @param The
	 *            Block to spawn
	 * @param The
	 *            World to spawn in
	 * @param A
	 *            Random object for retrieving random positions within the world
	 *            to spawn the Block
	 * @param An
	 *            int for passing the X-Coordinate for the Generation method
	 * @param An
	 *            int for passing the Z-Coordinate for the Generation method
	 * @param An
	 *            int for setting the maximum X-Coordinate values for spawning
	 *            on the X-Axis on a Per-Chunk basis
	 * @param An
	 *            int for setting the maximum Z-Coordinate values for spawning
	 *            on the Z-Axis on a Per-Chunk basis
	 * @param An
	 *            int for setting the maximum size of a vein
	 * @param An
	 *            int for the Number of chances available for the Block to spawn
	 *            per-chunk
	 * @param An
	 *            int for the minimum Y-Coordinate height at which this block
	 *            may spawn
	 * @param An
	 *            int for the maximum Y-Coordinate height at which this block
	 *            may spawn
	 **/
	public void addOreSpawn(Block block, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chancesToSpawn, int minY, int maxY) {
		int maxPossY = minY + (maxY - 1);
		assert maxY > minY : "The maximum Y must be greater than the Minimum Y";
		assert maxX > 0 && maxX <= 16 : "addOreSpawn: The Maximum X must be greater than 0 and less than 16";
		assert minY > 0 : "addOreSpawn: The Minimum Y must be greater than 0";
		assert maxY < 256 && maxY > 0 : "addOreSpawn: The Maximum Y must be less than 256 but greater than 0";
		assert maxZ > 0 && maxZ <= 16 : "addOreSpawn: The Maximum Z must be greater than 0 and less than 16";

		int diffBtwnMinMaxY = maxY - minY;
		for (int x = 0; x < chancesToSpawn; x++) {
			int posX = blockXPos + random.nextInt(maxX);
			int posY = minY + random.nextInt(diffBtwnMinMaxY);
			int posZ = blockZPos + random.nextInt(maxZ);
			(new WorldGenMinable(block, maxVeinSize)).generate(world, random, posX, posY, posZ);
		}
	}
}