import type { NextApiRequest, NextApiResponse } from 'next'
import { Server } from 'socket.io'
 
export default async function loginHandler(req: NextApiRequest, res: NextApiResponse) {
  const data = req.body
  const id = await 
  res.status(200).json({ id })
}