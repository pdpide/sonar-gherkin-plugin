/*
 * SonarQube Cucumber Gherkin Analyzer
 * Copyright (C) 2016-2017 David RACODON
 * david.racodon@gmail.com
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */
package org.sonar.gherkin.tree.impl;

import com.google.common.collect.Iterators;
import org.sonar.plugins.gherkin.api.tree.PrefixTree;
import org.sonar.plugins.gherkin.api.tree.SyntaxToken;
import org.sonar.plugins.gherkin.api.tree.Tree;

import java.util.Iterator;

public abstract class AbstractPrefixTreeImpl extends GherkinTree implements PrefixTree {

  private final SyntaxToken keyword;

  public AbstractPrefixTreeImpl(SyntaxToken keyword) {
    this.keyword = keyword;
  }

  @Override
  public Iterator<Tree> childrenIterator() {
    return Iterators.singletonIterator(keyword);
  }

  @Override
  public SyntaxToken keyword() {
    return keyword;
  }

  @Override
  public String text() {
    return keyword.text();
  }

}
