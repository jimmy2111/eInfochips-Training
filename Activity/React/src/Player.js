import React from 'react'

export const Player = ({player}) => {
  return (
    <div>
        <h2>{player.id}--{player.name}--{player.country}--{player.runs}</h2>
    </div>
  )
}
