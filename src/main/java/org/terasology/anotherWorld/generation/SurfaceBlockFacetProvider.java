/*
 * Copyright 2015 MovingBlocks
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.terasology.anotherWorld.generation;

import org.terasology.world.generation.Facet;
import org.terasology.world.generation.FacetProvider;
import org.terasology.world.generation.GeneratingRegion;
import org.terasology.world.generation.Produces;
import org.terasology.world.generation.Requires;
import org.terasology.world.generation.facets.SurfaceHeightFacet;

@Produces(SurfaceBlockFacet.class)
@Requires({@Facet(BlockLayersFacet.class), @Facet(SurfaceHeightFacet.class),
        @Facet(CaveFacet.class), @Facet(OreBlockFacet.class)})
public class SurfaceBlockFacetProvider implements FacetProvider {
    @Override
    public void setSeed(long seed) {

    }

    @Override
    public void process(GeneratingRegion region) {

    }
}
