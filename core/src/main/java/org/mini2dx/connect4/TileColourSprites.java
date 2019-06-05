/*
/*******************************************************************************
 * Copyright 2019 Viridian Software Limited
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package org.mini2dx.connect4;

import com.badlogic.gdx.graphics.Texture;
import org.mini2Dx.core.graphics.Sprite;

public class TileColourSprites {

    private static final String EMPTY_TILE = "tileGrey_27.png";
    private static final String RED_TILE = "tileRed_27.png";
    private static final String BLUE_TILE = "tileBlue_27.png";
    private Sprite blueSprite, redSprite, emptySprite;

     TileColourSprites() {
        redSprite = new Sprite(new Texture(RED_TILE));
        blueSprite = new Sprite(new Texture(BLUE_TILE));
        emptySprite = new Sprite(new Texture(EMPTY_TILE));
    }

    Sprite getBlueSprite() {
        return blueSprite;
    }

    Sprite getRedSprite() {
        return redSprite;
    }

    Sprite getEmptySprite() {
        return emptySprite;
    }


}
