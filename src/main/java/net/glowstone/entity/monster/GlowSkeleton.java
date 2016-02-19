package net.glowstone.entity.monster;

import net.glowstone.entity.meta.MetadataIndex;
import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Skeleton;

public class GlowSkeleton extends GlowMonster implements Skeleton {
    private SkeletonType skeletonType = SkeletonType.NORMAL;

    public GlowSkeleton(Location loc) {
        super(loc, EntityType.SKELETON, 20);
    }

    @Override
    public SkeletonType getSkeletonType() {
        return this.skeletonType;
    }

    @Override
    public void setSkeletonType(SkeletonType type) {
        this.skeletonType = type;
        metadata.set(MetadataIndex.SKELETON_TYPE, skeletonType.getId());
    }
}
