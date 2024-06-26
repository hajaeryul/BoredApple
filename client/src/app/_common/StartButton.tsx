import Link from 'next/link';

export default function StartButton() {
  return (
    <>
      <Link href={'/login'}>
        <div
          className='text-sm px-2 md:px-7 lg:px-7 py-2 cursor-pointer bg-ourBlack rounded-full text-white duration-[0.2s]
          hover:bg-ourBlack/60'
        >
          <button>시작하기</button>
        </div>
      </Link>
    </>
  );
}
