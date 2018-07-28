/**
 *   This file is part of Skript.
 *
 *  Skript is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  Skript is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with Skript.  If not, see <http://www.gnu.org/licenses/>.
 *
 *
 * Copyright 2011-2017 Peter Güttinger and contributors
 */
package ch.njol.skript.lang.util;

import org.bukkit.event.Event;
import org.eclipse.jdt.annotation.Nullable;

import ch.njol.skript.lang.TriggerItem;

/**
 * An interface for {@link TriggerItem}s that "lie" about their next items,
 * typically to repeat themselves.
 *
 * TODO: find a better name for this
 *
 * @see ch.njol.skript.sections.LoopSection
 * @see ch.njol.skript.sections.WhileSection
 * @see ch.njol.skript.sections.ConditionalSection
 * @see ch.njol.skript.effects.EffExit
 */
public interface LyingItem {

	@Nullable
	TriggerItem getTrueNext(@Nullable Event e);

}
