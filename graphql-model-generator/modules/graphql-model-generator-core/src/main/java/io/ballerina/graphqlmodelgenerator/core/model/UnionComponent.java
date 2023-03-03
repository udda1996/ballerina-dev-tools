/*
 *  Copyright (c) 2023, WSO2 LLC. (http://www.wso2.com) All Rights Reserved.
 *
 *  WSO2 LLC. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */

package io.ballerina.graphqlmodelgenerator.core.model;

import io.ballerina.stdlib.graphql.commons.types.Position;

import java.util.List;

/**
 * Represents the Union component of graphql model.
 *
 * @since 2201.5.0
 */
public class UnionComponent {
    private final String name;
    private final Position position;
    private final String description;
    private final List<Interaction> possibleTypes;

    public UnionComponent(String name, Position position, String description, List<Interaction> possibleTypes) {
        this.name = name;
        this.position = position;
        this.description = description;
        this.possibleTypes = possibleTypes;
    }

    public String getName() {
        return name;
    }

    public Position getPosition() {
        return position;
    }

    public String getDescription() {
        return description;
    }

    public List<Interaction> getPossibleTypes() {
        return possibleTypes;
    }
}
