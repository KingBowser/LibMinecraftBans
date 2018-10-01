package pw.bowser.minebans

import java.util.Date
import java.util.UUID

/**
 * Ban model.
 *
 * Contains information about a single ban.
 *
 * Provides accessors for
 *  'identifier', which can be a field to represent the ban's ID on the service
 *  'userid'    which should conventionally be the UUID of the banned player
 *  'banreason' which should be the reason for the ban
 *  'date'      date of the ban, if available
 *  'creator'   userId (or user) that performed the banning, if available
 *
 * @author Bowser
 */
case class Ban(identifier:  UUID,
               userId:      UUID,
               banReason:   String,
               banDate:     Date,
               creator:     UUID)
